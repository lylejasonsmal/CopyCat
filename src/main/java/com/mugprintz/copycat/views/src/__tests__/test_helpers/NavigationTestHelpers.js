import { mount } from '@vue/test-utils'
import { createRouter, createWebHistory } from 'vue-router'
import { routes } from '@/router/index.js'
import App from '../../App.vue'

export function createTestRouter() {
  return createRouter({ history: createWebHistory(), routes })
}

export async function CreateTestNavigationAsync() {
  const router = createTestRouter()
  let Sut = mount(App, { global: { plugins: [router] } })

  return {
    get Sut() {
      return Sut
    },
    router,
    async NavigateToAsync(path) {
      await router.push(path)
      await router.isReady()
      Sut = mount(App, { global: { plugins: [router] } })
    },
  }
}
