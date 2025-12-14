import {mount} from "@vue/test-utils";
import Spinner from "@/components/Spinner.vue";

describe("Spinner", () => {
  const sut = mount(Spinner);

  it('SHOULD render spinner', () => {
    expect(sut.exists()).toBe(true);
  });
})
