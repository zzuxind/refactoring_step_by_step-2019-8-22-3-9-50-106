# refactoring_step_by_step
1.Driver 类中age public->private  
2.为age添加get方法  
3. 将police中if(driver.age >= 18)改为if(driver.getAge() >= 18)  
4.将18设置为常量  
5.将police中if(driver.age >= 18)改为if(driver.getAge() >= checkedAge) 