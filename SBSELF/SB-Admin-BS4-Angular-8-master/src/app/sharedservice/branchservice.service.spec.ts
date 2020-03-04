import { TestBed } from '@angular/core/testing';

import { BranchserviceService } from './branchservice.service';

describe('BranchserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BranchserviceService = TestBed.get(BranchserviceService);
    expect(service).toBeTruthy();
  });
});
