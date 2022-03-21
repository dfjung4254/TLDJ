<template>
  <div id="BackContext">
    <MainContainer />
  </div>
</template>

<script>
import MainContainer from "@/components/MainContainer";

export default {
  name: "BackContext",
  components: {
    MainContainer
  }
}
</script>

<style scoped>
#BackContext {
  height: 100%;
  width: 100%;
  margin: 0;
  overflow: hidden;
  background: url("../assets/background_sample.webp") no-repeat center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
</style>