import { CreateTestNavigationAsync } from "@/__tests__/test_helpers/NavigationTestHelpers.js";
import LandingPage from "@/pages/LandingPage.vue";
import PrivacyPolicyPage from "@/pages/PrivacyPolicyPage.vue";
import DataPolicyPage from "@/pages/DataPolicyPage.vue";
import PrintingProgressPage from "@/pages/PrintingProgressPage.vue";

let TestNavigation = null;
let Sut = null;

async function SetupAsync(){
  TestNavigation = await CreateTestNavigationAsync();
  Sut = TestNavigation.Sut;
}

it('SHOULD render LandingPage at ["/"]', async () => {
  //Arrange
  await SetupAsync()

  //Act
  await TestNavigation.NavigateToAsync('/')

  //Assert
  expect(
    Sut.findComponent(LandingPage).exists()
  ).toBe(true)
})

it('SHOULD render PrivacyPolicyPage at ["/privacy-policy"]', async () => {
  //Arrange
  await SetupAsync()

  //Act
  await TestNavigation.NavigateToAsync('/privacy-policy')

  //Assert
  expect(
    Sut.findComponent(PrivacyPolicyPage).exists()
  ).toBe(true)
})

it('SHOULD render DataPolicyPage at ["/data-policy"]', async () => {
  //Arrange
  await SetupAsync()

  //Act
  await TestNavigation.NavigateToAsync('/data-policy')

  //Assert
  expect(
    Sut.findComponent(DataPolicyPage).exists()
  ).toBe(true)
})

it('SHOULD render PrintingProgressPage at ["/printing-progress"]', async () => {
  //Arrange
  await SetupAsync()

  //Act
  await TestNavigation.NavigateToAsync('/printing-progress')

  //Assert
  expect(
    Sut.findComponent(PrintingProgressPage).exists()
  ).toBe(true)
})
