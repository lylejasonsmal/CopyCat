import { createRouter, createWebHistory } from 'vue-router'
import PrivacyPolicyPage from "@/pages/PrivacyPolicyPage.vue";
import DataPolicyPage from "@/pages/DataPolicyPage.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/privacy-policy', name: "PrivacyPolicyPage", component: PrivacyPolicyPage },
    { path: '/data-policy', name: "DataPolicyPage", component: DataPolicyPage }
  ],
})

export default router
