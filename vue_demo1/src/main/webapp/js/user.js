new Vue({
    el:"#app",
    data:{
        user:{

        },
        userList:[]

    },
    methods:{
      findAll:function () {
          //在当前对象定义一个变量,表明是vue对象
          var _this = this;
          axios.get('/vue/user/findAll.do')
              .then(function (response) {
                 _this.userList=response.data;//响应数据给userList赋值
              })
              .catch(function (error) {
                  // handle error
                  console.log(error);
              })
      },
      findById:function (userid) {
          //在当前对象定义一个变量,表明是vue对象
          var _this = this;
          axios.get('/vue/user/findById.do?',{params:{id:userid}})
              .then(function (response) {
                  _this.user=response.data;//响应数据给user赋值
                  $("#myModal").modal("show");
              })
              .catch(function (error) {
                  // handle error
                  console.log(error);
              })
      },
      update:function (user) {
          //在当前对象定义一个变量,表明是vue对象
          var _this = this;
          axios.post('/vue/user/updateUser.do',_this.user)
              .then(function (response) {
                  _this.findAll();
              })
              .catch(function (error) {
                  console.log(error);
              });
      }
    },
    created:function () {//当页面加载的时候,触发请求,查询所有
        this.findAll();
    }
});