import { NgModule, Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard/dashboard.component';
import { Routes, RouterModule } from '@angular/router';
import { InsuranceCompanyComponent } from './insurance-company/insurance-company.component';
import { DepartmentComponent } from './department/department.component';
import { AddressComponent } from './address/address.component';
import { FormsModule} from '@angular/forms';
import { InsuranceCompanyAddComponent } from './insurance-company-add/insurance-company-add.component';
import { Address } from 'src/app/Custommodel/Address.Custommodel';
import { BranchComponent } from './branch/branch.component';
import { BranchtypeComponent } from './branchtype/branchtype.component';

const adminrouting: Routes = [
    {path: 'dashboard', component: DashboardComponent },
     {path: 'insurancecompany',  component: InsuranceCompanyComponent,children:[ {path:'insurancecompanyadd', component:InsuranceCompanyAddComponent}] },
     {path:'department', component:DepartmentComponent},
     {path:'Address',component:AddressComponent},
     {path:'branch',component:BranchComponent,children:[{path:'branchtype',component:BranchtypeComponent}]},
    
];
@NgModule({
    declarations: [DashboardComponent, InsuranceCompanyComponent, DepartmentComponent, AddressComponent, InsuranceCompanyAddComponent, BranchComponent, BranchtypeComponent,],
    imports: [CommonModule, RouterModule.forChild(adminrouting),FormsModule]
})
export class AdminModule {}
