import {mount} from "@vue/test-utils";
import ButtonComponent from "@/components/ButtonComponent.vue";

describe("Button", () => {
  const sut = mount(ButtonComponent, {
    props: {
      buttonText: "You've Haven't Set A Button Text Prop Yet"
    }
  });

  it('SHOULD render component', async () => {
    await sut.setProps({buttonText: 'MyButton'})
    expect(sut.exists()).toBe(true);
    expect(sut.find("#button-component").text()).toBe("MyButton");
  });
})
