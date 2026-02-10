import PrintingProgressPage from "@/pages/PrintingProgressPage.vue";
import {mount} from "@vue/test-utils";
import Spinner from "@/components/Spinner.vue";

describe("PrintingProgressPage", ()=>{
  const sut = mount(PrintingProgressPage);

  it("SHOULD render printing page heading", ()=> {
    const printingPageHeading = sut.find("#printing-page-heading");
    expect(printingPageHeading.text()).toBe("Printing")

    const spinner = sut.findComponent(Spinner);
    expect(spinner.exists()).toBe(true)
  });
})
