import Vue from 'vue'
import Vuex from 'vuex'
import router from './router'
Vue.use(Vuex);

new Vue({
    router,
    render: h => h(require('./App'))
}).$mount('#app');