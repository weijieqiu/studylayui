/**
 * 扩展一个 test 模块
 **/
layui.define(function (exports) {
    var obj = {
        hello: function (str) {
            alert('Hello ' + (str || 'mymod'));
        }
    };

    exports('mymod', obj)
})