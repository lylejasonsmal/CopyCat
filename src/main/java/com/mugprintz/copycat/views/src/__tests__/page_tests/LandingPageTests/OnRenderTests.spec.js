import {mount} from "@vue/test-utils";
import LandingPage from "@/pages/LandingPage.vue";

describe("LandingPage [OnRenderTests]", ()=>{
  //Arrange
  const sut = mount(LandingPage);

  it("SHOULD render landing page text", () => {
    const dataPolicyHeading = sut.find("#landing-message");
    expect(dataPolicyHeading.text()).toBe("Under Development. Please Check Back Soon!")
  });

})
