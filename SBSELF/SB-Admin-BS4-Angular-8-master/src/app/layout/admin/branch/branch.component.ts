import { Component, OnInit } from '@angular/core';
import { BranchserviceService } from 'src/app/sharedservice/branchservice.service';
import { Branch } from 'src/app/Custommodel/Branch.Custommodel';

@Component({
  selector: 'app-branch',
  templateUrl: './branch.component.html',
  styleUrls: ['./branch.component.scss']
})
export class BranchComponent implements OnInit {

  constructor(private s:BranchserviceService) { }

  ngOnInit() {
  }
  submitbranch(bra:Branch)
  {
    if(bra.branchId==null)
    {
    this.s.postbranchdata(bra).subscribe();
    }
    else{
      this.s.updatedata(bra).subscribe();
    }
  }
  resetdata()
  {
    this.s.brh=Object.assign({},null);
  }
  editdata(bra:Branch)
  {
    this.s.brh=Object.assign({},bra);
  }
  deletedata(bra:Branch)
  {
    this.s.deletebranchdata(bra).subscribe();
  }


}
