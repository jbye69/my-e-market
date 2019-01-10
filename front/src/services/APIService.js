import axios from 'axios';

const API_URL = 'http://localhost:9880/api/v1/';

export class APIService {

    constructor() {}

    getUsers() {
        console.log('getUsers test');
        return axios.get(API_URL + "/user").then(
            response => {
               return response.data;
            },
            function (error) {
                console.log("Erreur : " + error);
            }
        );
    }
    getUserById(id){
        return axios.get( API_URL+"/user/" + id).then(response => response.data);
    }
}