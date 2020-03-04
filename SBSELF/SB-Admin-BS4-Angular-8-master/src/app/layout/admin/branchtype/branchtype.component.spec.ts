import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BranchtypeComponent } from './branchtype.component';

describe('BranchtypeComponent', () => {
  let component: BranchtypeComponent;
  let fixture: ComponentFixture<BranchtypeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BranchtypeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BranchtypeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
