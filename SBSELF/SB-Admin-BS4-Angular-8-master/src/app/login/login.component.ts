import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { routerTransition } from '../router.animations';
export interface user {
    username: string;
    password: string;
    repassword: string;
    email: string;
}

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.scss'],
    animations: [routerTransition()]
})
export class LoginComponent implements OnInit {
    u: user = {
        username: '',
        password: '',
        repassword: '',
        email: ''
    };
    constructor(public router: Router) {}

    ngOnInit() {}

    onLoggedin(u) {
        localStorage.setItem('isLoggedin', 'true');
        //    this.router.navigateByUrl('/role/ah/dashboard');
        console.log('login called');
        console.log(u.email, u.password);
        if (u.email === 'oe' && u.password === 'oe') {
            console.log('in oe');
            sessionStorage.setItem('role', 'oe');
            this.router.navigateByUrl('role/oe/dashboard');
        }
        if (u.email === 'ah' && u.password === 'ah') {
            console.log('in ah');
            sessionStorage.setItem('role', 'ah');
            this.router.navigateByUrl('role/ah/dashboard');
        }
        if (u.email === 'admin' && u.password === 'admin') {
            console.log('in admin');
            sessionStorage.setItem('role', 'admin');
            this.router.navigateByUrl('role/admin/dashboard');
        }
        if (u.email === 'se' && u.password === 'se') {
            console.log('in se');
            sessionStorage.setItem('role', 'se');
            this.router.navigateByUrl('role/se/dashboard');
        }
        if (u.email === 'sales' && u.password === 'sales') {
            console.log('in sales');
            sessionStorage.setItem('role', 'sales');
            this.router.navigateByUrl('role/sales/dashboard');
        }
    }
}
