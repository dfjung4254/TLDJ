<template>
  <div id="MainContainer">
    <CdContainer />
    <ListContainer />
  </div>
</template>

<script>
import CdContainer from "./CdContainer.vue";
import ListContainer from "./ListContainer.vue";

export default {
  name: "MainContainer",
  components : {
    CdContainer,
    ListContainer
  }
}
</script>

<style scoped>
#MainContainer {
  height: 100%;
  width: 100%;
  overflow: hidden;
  backdrop-filter: blur(5px);
  display: grid;
  grid-template-columns: repeat(2, 1fr);
}
</style>
