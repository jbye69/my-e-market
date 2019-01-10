<template>
    <div>
        <h1>Utilisateurs ()</h1>
        <table class="table table-bordered table-hover">
            <thead>
            <tr>
                <th>#</th>

                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th> Address</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="user in users">

                <th>{ { user.pk } }</th>
                <th>{ { user.first_name } }</th>
                <td>{ { user.last_name } }</td>
                <td>{ { user.email } }</td>
                <td>

                    <button class="btn btn-danger" @click="deleteUser(user)"> X</button>
                </td>
            </tr>
            </tbody>
        </table>
        <div>
        </div>
    </div>
</template>

<script>
    import store from '../store/UserStore';

    export default {

        store: store,
        name: 'ListUsers',

        components: {

        },

        data() {

            return {
                users: [],

            };

        },

        methods: {

        getUsers(){
                apiService.getUsers().then(
                    data => {
                    console.log(" blablabla");
                    this.users = data;
                });
            },
        },

        mounted() {
         this.getUsers();
        },
    }
</script>

<style scoped>

</style>