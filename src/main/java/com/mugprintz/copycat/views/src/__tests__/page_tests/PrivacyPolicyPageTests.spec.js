import { mount } from "@vue/test-utils";
import PrivacyPolicyPage from "../../pages/PrivacyPolicyPage.vue";

describe("PrivacyPolicyPage", () => {

  it("renders the Privacy Policy heading", () => {
    const sut = mount(PrivacyPolicyPage);

    expect(sut.text()).toContain("Privacy Policy");
  });

  it("SHOULD render the privacy policy message", ()=>{
    const sut = mount(PrivacyPolicyPage)
    const privacyPolicyMessage = sut.find("#privacy-policy-message");

    expect(privacyPolicyMessage.text()).toContain("Our Privacy Policy Aims To Ensure That Your Information is Secure & Protected In Compliance With South Africa’s POPI Act.")
  });

});
