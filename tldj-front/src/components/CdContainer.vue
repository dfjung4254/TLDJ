<template>
  <div id="CdContainer">
    <div id="track-slider" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-inner">
        <div class="carousel-item">
          <img src="../assets/album1.jpeg" class="d-block w-100" >
        </div>
        <div class="carousel-item active" data-bs-interval="2000">
          <img src="../assets/album2.jpeg" class="d-block w-100" >
        </div>
        <div class="carousel-item" data-bs-interval="2000">
          <img src="../assets/album3.jpeg" class="d-block w-100" >
        </div>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: "CdContainer",
  components: {
  }
}
</script>

<style scoped>
#CdContainer {
  text-align: center;
}
#track-slider {
  width: 600px;
  height: 600px;
  transform: translate(-50%, -50%);
  top: 50%;
  left: 50%;
}
</style>