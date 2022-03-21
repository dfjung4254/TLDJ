<template>
  <div id="ListContainer">
    <div id="music-title" >
      <h1 class="display-1">Track List</h1>
    </div>
    <div id="music-list">
      <ul class="list-group track-group">
        <li class="list-group-item track-item"><h3>1. Sample Track Name 1 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>2. Sample Track Name 2 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>3. Sample Track Name 3 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>4. Sample Track Name 4 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>5. Sample Track Name 5 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>6. Sample Track Name 6 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>7. Sample Track Name 7 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>8. Sample Track Name 8 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>9. Sample Track Name 9 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>10. Sample Track Name 10 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>11. Sample Track Name 11 (3:33)</h3></li>
        <li class="list-group-item track-item"><h3>12. Sample Track Name 12 (3:33)</h3></li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "ListContainer"
}
</script>

<style scoped>
#ListContainer {

}
#music-title {
  /* todo */
  margin-top: 200px;
}
#music-list {

}
.track-group {
  background: transparent;
}
.track-item {
  background: transparent;
  border: 0;
}
</style>