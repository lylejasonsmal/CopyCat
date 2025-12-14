import PrintingProgressPage from "@/pages/PrintingProgressPage.vue";
import {mount} from "@vue/test-utils";

describe("PrintingProgressPage", ()=>{
  const sut = mount(PrintingProgressPage);

  it("SHOULD render printing page heading", ()=> {
    const printingPageHeading = sut.find("#printing-page-heading");
    expect(printingPageHeading.text()).toContain("Printing")
  });
})
