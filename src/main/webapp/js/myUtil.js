function getLocalTime(mytime) {
    var date = new Date(mytime);
    return date.getFullYear()+"年"+date.getMonth()+1+"月"+date.getDate()+"日"+date.getHours()+"时"+date.getMinutes()+"分"+date.getSeconds()+"秒";}