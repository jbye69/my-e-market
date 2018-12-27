<template>
    <div id="app">
        {{users}}
    </div>
</template>
<style>
</style>
<script>
    import {APIService} from "./services/APIService";

    const apiService = new APIService();
    export default {
        components: {},
        data() {
            var users;
            return {users};
        },
        methods: {
            getContacts() {
                apiService.getUsers().then((data) => {

                    this.users = data.data;
                });
            },
            mounted() {
                this.getContacts();
            },
        },
    }
</script>