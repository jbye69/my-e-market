import Vue from 'vue'
import Router from 'vue-router'
import SignIn from "./components/sign-in/SignIn";
import NavBarView from "./views/NavBarView";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      component: NavBarView
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
