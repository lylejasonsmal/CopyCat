import {mount} from "@vue/test-utils";
import WelcomePage from "@/pages/WelcomePage.vue";
import ButtonComponent from "@/components/ButtonComponent.vue";

describe("WelcomePage", ()=>{
  //Act
  const sut = mount(WelcomePage);

  //Assert
  it("SHOULD render component", () => {
    const welcomeHeading = sut.find("#welcome-heading")
    expect(welcomeHeading.text()).toBe("Welcome")

    const proceedButton = sut.findComponent(ButtonComponent)
    expect(proceedButton.isVisible()).toBe(true)
    expect(proceedButton.html()).toContain("Proceed")
  });
})
