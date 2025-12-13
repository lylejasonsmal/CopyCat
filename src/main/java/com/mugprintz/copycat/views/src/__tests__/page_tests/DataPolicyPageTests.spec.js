import {mount} from "@vue/test-utils";
import DataPolicyPage from "@/pages/DataPolicyPage.vue";

describe("DatePolicyPage", ()=>{
  //Arrange
  const sut = mount(DataPolicyPage);

  it("SHOULD render data policy heading", () => {
    const dataPolicyHeading = sut.find("#data-policy-heading");
    expect(dataPolicyHeading.text()).toContain("Data Policy")
  });

  it("SHOULD render data policy message", () => {
    const dataPolicyMessage = sut.find("#data-policy-message");
    expect(dataPolicyMessage.text()).toContain("Our Data Policy Aims To Ensure That Your Data Is Used Within Reasonable Boundaries And To Provided The Best Possible Service.")
  });
})
