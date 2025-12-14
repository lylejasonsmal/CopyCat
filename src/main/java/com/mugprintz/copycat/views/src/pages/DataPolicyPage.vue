<template>
  <div id="data-policy-page"  class="information-page">
    <h1 id="data-policy-heading">Data Policy</h1>
    <p id="data-policy-message">
      Our Data Policy Aims To Ensure That Your Data Is Used Within Reasonable Boundaries And To Provided The Best Possible Service.
    </p>
    <ProgressComponent :percentage=10></ProgressComponent>
  </div>
</template>

<style scoped>
p{
  font-size: var(--large-paragraph-font-size);
  width: 90vw;
  text-align: center;
}
</style>
<script setup lang="ts">
import ProgressComponent from "@/components/ProgressComponent.vue";
</script>
