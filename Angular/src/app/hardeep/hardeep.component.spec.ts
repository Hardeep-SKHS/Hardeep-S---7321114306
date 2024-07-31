import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HardeepComponent } from './hardeep.component';

describe('HardeepComponent', () => {
  let component: HardeepComponent;
  let fixture: ComponentFixture<HardeepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [HardeepComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HardeepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
