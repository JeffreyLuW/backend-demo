import axios from "axios";
const API_URL = "http://localhost:8080/api/players";

class PlayerService {
  getAllPlayers() {
    return axios.get(API_URL);
  }
  getPlayerById(id) {
    return axios.get(`${API_URL}/${id}`);
  }
  createPlayer(player) {
    return axios.post(API_URL, player);
  }
  updatePlayer(player) {
    return axios.put(API_URL, player);
  }
  deletePlayer(id) {
    return axios.delete(`${API_URL}/${id}`);
  }
}

export default new PlayerService();
