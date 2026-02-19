import {mount} from "@vue/test-utils";
import WelcomePage from "@/pages/WelcomePage.vue";
import ButtonComponent from "@/components/ButtonComponent.vue";

describe("WelcomePage", ()=>{
  //Act
  const sut = mount(WelcomePage);

  //Assert
  it("SHOULD render page", () => {
    const welcomeHeading = sut.find("#welcome-heading")
    expect(welcomeHeading.text()).toBe("Welcome")

    const proceedButton = sut.findComponent(ButtonComponent)
    expect(proceedButton.isVisible()).toBe(true)
    expect(proceedButton.html()).toContain("proceed")

    const introductionForm = sut.find("#introduction-form")
    expect(introductionForm.exists()).toBe(true)

    const introductionText = sut.find("#introduction-text")
    expect(introductionText.text()).toBe("Introduce Yourself")

    const firstNameField = sut.find("#first-name-field")
    expect(firstNameField.exists()).toBe(true)

    const surnameField = sut.find("#surname-field")
    expect(surnameField.exists()).toBe(true)

    const emailField = sut.find("#email-field")
    expect(emailField.exists()).toBe(true)
  });
})
