import { defineConfig, mergeConfig, configDefaults } from 'vitest/config'
import viteConfig from './vite.config'
import { fileURLToPath } from 'node:url'
import { dirname, resolve } from 'node:path'

const root = resolve(dirname(fileURLToPath(import.meta.url)))

export default mergeConfig(
  viteConfig,
  defineConfig({
    test: {
      root,
      environment: 'jsdom',
      include: ['src/__tests__/**/*.spec.js'],
      exclude: [...configDefaults.exclude, 'e2e/**'],
    },
  }),
)
