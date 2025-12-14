<template>
  <div class="progress-ring"  :style="{ '--value': percentage }">
  </div>
</template>
<script setup>
  import {ref} from "vue";

  const props = defineProps({
    percentage: Number
  });

  const percentage = ref(props.percentage);

</script>
