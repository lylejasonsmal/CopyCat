<template>
  <button id="button-component">{{ buttonText }}</button>
</template>
<script setup>
defineProps({
  buttonText: {
    type: String,
    required: true
  }});
</script>
