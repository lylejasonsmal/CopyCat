<template>
  <button id="button-component">{{ param.ButtonText }}</button>
</template>
<script setup>
const param = defineProps({
  ButtonText: {
    type: String,
    required: true
  }});
</script>
