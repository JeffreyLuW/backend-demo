<template>
  <div>
    <ul>
      <li v-for="player in players" :key="player.id">
        {{ player.name }} - PPG: {{ player.ppg }} - RPG: {{ player.rpg }} - APG: {{ player.apg }}
      </li>
    </ul>
  </div>
</template>

<script>
import PlayerService from '@/services/PlayerService.js';

export default {
  data() {
    return {
      players: []
    };
  },
  created() {
    PlayerService.getAllPlayers()
      .then(response => {
        this.players = response.data;
      })
      .catch(error => {
        console.log(error);
      });
  }
};
</script>

