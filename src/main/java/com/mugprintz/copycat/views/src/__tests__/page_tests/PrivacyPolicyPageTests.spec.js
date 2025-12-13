import { mount } from "@vue/test-utils";
import PrivacyPolicyPage from "../../pages/PrivacyPolicyPage.vue";

describe("PrivacyPolicyPage", () => {
  //Arrange
  const sut = mount(PrivacyPolicyPage);

  it("SHOULD render the privacy policy heading", () => {
    const privacyPolicyHeading = sut.find("#privacy-policy-heading");
    expect(privacyPolicyHeading.text()).toContain("Privacy Policy");
  });

  it("SHOULD render the privacy policy message", ()=>{
    const privacyPolicyMessage = sut.find("#privacy-policy-message");
    expect(privacyPolicyMessage.text()).toContain("Our Privacy Policy Aims To Ensure That Your Information is Secure & Protected In Compliance With South Africa’s POPI Act.")
  });

});
