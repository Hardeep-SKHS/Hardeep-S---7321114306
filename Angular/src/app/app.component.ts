import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : string;
  age : number;
  email : string;
  image : string;
  fname : string;
  flag : boolean;
  vehicles : string[];
  setselected : string;
  myStyle = {};
  chcolor : string;

constructor(){
  this.name = "Hardeep";
  this.age = 24;
  this.email = "hardeep.skhs@gmail.com";
  this.image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqG7vNkn089n-V0BSebTvBc8f0ZLmA3YvW9w&s";
  this.fname = ""
  this.flag = true;
  this.vehicles = ["Two Wheeler", "Tree Wheeler", "Four Wheeler"]
  this.setselected = " ";
  this.myStyle = {'width':'40%','height':'30%','border':'5px solid lightblue','padding-left':'50px','margin-left':'200px'}
  this.chcolor = "changecolor"
}
Change(){
  this.name = "Singh"; 
}
ChangeImage(){
  this.image="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2tNlqf0CH0kNW7YVpzKQKnzIXF2IjpdOhVw&s";
}
changeFlag(){
  this.flag = ! this.flag;
}
setselecteditem(vec:string){
  this.setselected = vec;
}
changestyle(){
  this.myStyle = {'width':'40%','height':'30%','border':'10px solid lightgreen','padding-left':'50px','margin-left':'200px'}

}
// changecolor(){
//   this.chgecolor = "color";
// }
}
