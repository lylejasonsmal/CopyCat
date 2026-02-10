import { InitializeTestNavigationServiceAsync } from "@/__tests__/test_helpers/NavigationTestHelpers.js";
import LandingPage from "@/pages/LandingPage.vue";
import PrivacyPolicyPage from "@/pages/PrivacyPolicyPage.vue";
import DataPolicyPage from "@/pages/DataPolicyPage.vue";
import PrintingProgressPage from "@/pages/PrintingProgressPage.vue";
import WelcomePage from "@/pages/WelcomePage.vue";

let TestNavigationService = null;
let Sut = null;

async function SetupAsync(){
  TestNavigationService = await InitializeTestNavigationServiceAsync();
  Sut = TestNavigationService.Sut;
}

it('SHOULD render LandingPage at ["/"]', async () => {
  //Arrange
  await SetupAsync()

  //Act
  await TestNavigationService.NavigateToAsync('/')

  //Assert
  expect(
    Sut.findComponent(LandingPage).exists()
  ).toBe(true)
})

it('SHOULD render PrivacyPolicyPage at ["/privacy-policy"]', async () => {
  //Arrange
  await SetupAsync()

  //Act
  await TestNavigationService.NavigateToAsync('/privacy-policy')

  //Assert
  expect(
    Sut.findComponent(PrivacyPolicyPage).exists()
  ).toBe(true)
})

it('SHOULD render DataPolicyPage at ["/data-policy"]', async () => {
  //Arrange
  await SetupAsync()

  //Act
  await TestNavigationService.NavigateToAsync('/data-policy')

  //Assert
  expect(
    Sut.findComponent(DataPolicyPage).exists()
  ).toBe(true)
})

it('SHOULD render PrintingProgressPage at ["/printing-progress"]', async () => {
  //Arrange
  await SetupAsync()

  //Act
  await TestNavigationService.NavigateToAsync('/printing-progress')

  //Assert
  expect(
    Sut.findComponent(PrintingProgressPage).exists()
  ).toBe(true)
})

it('SHOULD render WelcomePage at ["/welcome"]', async () => {
  //Arrange
  await SetupAsync()

  //Act
  await TestNavigationService.NavigateToAsync('/welcome')

  //Assert
  expect(Sut.findComponent(WelcomePage).exists()).toBe(true)
})
