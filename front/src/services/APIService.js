import axios from 'axios';

const API_URL = 'http://localhost:9880/api/v1/';
const userUrl = `${API_URL}/user/`;

export class APIService {

    constructor() {

    }

    getUsers() {
        console.log('getUsers');
        return axios.get("http://localhost:9880/api/v1/user").then(response => response.data);
    }

    getUserById(id) {
        return axios.get(userUrl + '/' + id).then(response => response.data);
    }


}