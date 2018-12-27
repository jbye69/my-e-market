import Vue from 'vue'
import App from './App.vue'
import router from './router'
import { Modal } from 'bootstrap-vue/es/components';
import { Scrollspy } from 'bootstrap-vue/es/directives';
import { Collapse } from 'bootstrap-vue/es/components';
Vue.use(Collapse);
Vue.use(Scrollspy);
Vue.use(Modal);
Vue.config.productionTip = false;

new Vue({
    router,
    render: h => h(App)
}).$mount('#app');


