<template>
  <button id="button-component" class="primary-button">{{ buttonText }}</button>
</template>
<script setup>
defineProps({
  buttonText: {
    type: String,
    required: true
  }});
</script>
<style scoped>
  .primary-button{
    background: var(--primary-black-color);
    width: 100%;
    height: 10vh;
    color: var(--primary-white-color);
    font-size: large;
    border: none;
    transition: ease-in-out 0.3s;
  }

  .primary-button:hover {
    background: var(--primary-green-color);
    color: var(--primary-black-color);
  }
</style>
