import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/NavBar.vue'
import SignIn from "./components/sign-in/SignIn";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },{
      path: '/sign-in',
      name: 'sign-in',
      component: SignIn
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    }
  ]
})
