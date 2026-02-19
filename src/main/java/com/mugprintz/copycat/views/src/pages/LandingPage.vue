<template>
  <div id="landing-message" class="landing-message">
    <h4>
      Under Development. Please Check Back Soon!
    </h4>

    <router-link v-for="link in pageUrls"
                 :to="link.path"
                 :key="link.name">
      {{ link.name }}
    </router-link>
  </div>
</template>
<script setup>
import {routes} from "@/router/index.js";

const pageUrls = routes.map(route => {
  return {
    name: route.name,
    path: route.path
  };
});

</script>
<style scoped>
.landing-message {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  text-align: center;
  height: 100vh;
  width: 100%;
}
</style>
