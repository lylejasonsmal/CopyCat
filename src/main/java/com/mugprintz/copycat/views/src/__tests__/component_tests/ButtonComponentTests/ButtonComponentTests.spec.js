import {mount} from "@vue/test-utils";
import ButtonComponent from "@/components/ButtonComponent.vue";

describe("Button", () => {
  const sut = mount(ButtonComponent, {
    props: {
      ButtonText: "You've Haven't Set A Button Text Prop Yet"
    }
  });

  it('SHOULD render component', async () => {
    await sut.setProps({ButtonText: 'MyButton'})
    expect(sut.exists()).toBe(true);
    expect(sut.find("#button-component").text()).toBe("MyButton");
  });
})
