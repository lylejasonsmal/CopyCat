<template>
  <div class="welcome-page">
  <h1 id="welcome-heading">Welcome</h1>

    <div id="introduction-form" class="introduction-form">
      <h2 id="introduction-text">Introduce Yourself</h2>
      <input id="first-name-field" type="text" placeholder="what do we call you?"/>
      <input id="surname-field" type="text" placeholder="what's your surname?"/>
      <input id="email-field" type="text" placeholder="what's your email?"/>
    </div>

    <ButtonComponent :buttonText="proceedButtonText"/>
  </div>
</template>

<script setup>
import ButtonComponent from "@/components/ButtonComponent.vue";

const proceedButtonText = "proceed";
</script>

<style scoped>
.welcome-page {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  text-align: center;
  height: 100vh;
  width: 100%;
}

.introduction-form{
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  text-align: center;
  gap: 1vh;
  height: 80vh;
  width: 80vw;
}
</style>
