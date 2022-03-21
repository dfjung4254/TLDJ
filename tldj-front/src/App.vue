<template>
  <MainContext />
</template>

<script>
import MainContext from "./components/MainContext.vue";

export default {
  name: 'App',
  components: {
    MainContext,
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  height: 100%;
  width: 100%;
  margin: 0;
  overflow: hidden;
}

html, body {
  margin: 0;
  height: 100%;
  width: 100%;
  overflow: hidden;
}

</style>
