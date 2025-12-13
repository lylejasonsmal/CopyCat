import { createRouter, createWebHistory } from 'vue-router'
import PrivacyPolicyPage from "@/pages/PrivacyPolicyPage.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/privacy-policy', name: "PrivacyPolicyPage", component: PrivacyPolicyPage }
  ],
})

export default router
