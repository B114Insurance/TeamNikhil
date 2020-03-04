import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InsuranceCompanyAddComponent } from './insurance-company-add.component';

describe('InsuranceCompanyAddComponent', () => {
  let component: InsuranceCompanyAddComponent;
  let fixture: ComponentFixture<InsuranceCompanyAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InsuranceCompanyAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InsuranceCompanyAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
