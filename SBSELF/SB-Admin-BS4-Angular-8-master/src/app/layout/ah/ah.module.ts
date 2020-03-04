import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard/dashboard.component';
import { Routes, RouterModule } from '@angular/router';
import { DemoComponent } from './demo/demo.component';
const ahrouting: Routes = [
    { path: 'dashboard', component: DashboardComponent },
    { path: 'demo', component: DemoComponent }
];
@NgModule({
    declarations: [DashboardComponent, DemoComponent],
    imports: [CommonModule, RouterModule.forChild(ahrouting)]
})
export class AhModule {}
