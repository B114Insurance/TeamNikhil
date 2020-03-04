import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard/dashboard.component';
import { Routes, RouterModule } from '@angular/router';
const oerouting: Routes = [
    { path: 'dashboard', component: DashboardComponent }
];
@NgModule({
    declarations: [DashboardComponent],
    imports: [CommonModule, RouterModule.forChild(oerouting)]
})
export class OeModule {}
