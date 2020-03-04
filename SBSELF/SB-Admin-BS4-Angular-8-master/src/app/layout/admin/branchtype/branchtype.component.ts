import { Component, OnInit } from '@angular/core';
import { BranchserviceService } from 'src/app/sharedservice/branchservice.service';
import { Branch } from 'src/app/Custommodel/Branch.Custommodel';

@Component({
  selector: 'app-branchtype',
  templateUrl: './branchtype.component.html',
  styleUrls: ['./branchtype.component.scss']
})
export class BranchtypeComponent implements OnInit {
brc:Branch[];
  constructor(private s:BranchserviceService) { }

  ngOnInit() {

this.s.getdata().subscribe((data:Branch[])=>{this.brc=data}
)

  }

}
