<template>
<h1 id="welcome-heading">Welcome</h1>
  <ButtonComponent :buttonText="proceedButtonText"/>
</template>
<script setup>
import ButtonComponent from "@/components/ButtonComponent.vue";

const proceedButtonText = "Proceed";
</script>
